import './App.css';
import React from 'react';
import IssuesTable from './IssuesTable';
// import $ from 'jquery';

const BASE_URL = 'http://localhost:8080/';
const ISSUES_ENDPOINT = BASE_URL + 'api/issues';
const DEFAULT_REPO = 'https://github.com/kubernetes/kubernetes/';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      gitRepo: DEFAULT_REPO, 
      issues: {}
    };
  }

  componentDidMount() {
    this.getIssues();
  }

  // ajax call to the backend to get the github issues
  getIssues() {
    // $.ajax({
    //   type: "GET",
    //   url: ISSUES_ENDPOINT,
    //   success(data) {
    //     console.log(data);
    //       // setState({issues: data});
    //   },
    // });
    fetch(ISSUES_ENDPOINT)
    .then(response => response.json())
    .then(data => {
      console.log(data);
      this.setState({issues: data});
    });
  }

  render() {
    const {issues} = this.state;
    console.log(issues);
    return (
      <IssuesTable props={issues}/>
    );
  }
}

export default App;
