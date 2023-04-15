import './App.css';
import React from 'react';
import IssuesTable from '../components/IssuesTable';

const BASE_URL = 'http://localhost:8080/';
const ISSUES_ENDPOINT = BASE_URL + 'api/issues';
const DEFAULT_REPO = 'https://api.github.com/repos/kubernetes/kubernetes/issues';

// main application react component. Contains a form to update the URL and/or add params
class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      issues: [],
      errorMessage: null
    };
  }

  // load issues on mount
  componentDidMount() {
    this.getIssues({url: DEFAULT_REPO});
  }

  // ajax call to the backend to get the github issues
  getIssues = (body) => {
    const requestOptions = {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(body)
    };

    fetch(ISSUES_ENDPOINT, requestOptions)
    .then(response => response.json())
    .then(data => {
      if (data.status === "ERROR") {
        // don't update issues on error - just display the message
        this.setState({errorMessage: data.message});
      } else {
        this.setState({issues: data.issues, errorMessage: null});
      }

    });
  }

  // function to use the form elements to re-fetch issues with params/new url
  onSubmit = (e) => { 
    e.preventDefault();
    const data = e.target.elements;
    const body = {
      url: data.url?.value ?? DEFAULT_REPO,
      state: data.state.value,
      page: data.page.value
    }
    
    this.getIssues(body);
  }

  render() {
    const {issues, errorMessage} = this.state;

    return (
      <div className="App">
        <form onSubmit={this.onSubmit}>
          <label>
            URL:
            <input type="text" name="url" defaultValue={DEFAULT_REPO}/>
          </label>
          <label>
            page:
            <input type="number" name="page" defaultValue="1"/>
          </label>
          <label>Issue State:</label>
          <select name="state" defaultValue={"open"}>
            <option value="all">all</option>
            <option value="open">open</option>
            <option value="closed">closed</option>
          </select>
          <button type="submit">Reload</button>
        </form>
        <div>{errorMessage}</div>
        <IssuesTable rows={issues}/>
      </div>
    );
  }
}

export default App;
