/**
 * React component for displaying the issues in a table.
 */
import * as React from 'react';
import PropTypes from 'prop-types';
import './IssuesTable.css';

class IssuesTable extends React.Component {

    render() {
        return (
            <table className='IssuesTable'>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>TITLE</th>
                        <th>STATE</th>
                    </tr>
                </thead>
                <tbody>
                {this.props.rows.map((row) => {
                    return (
                        <tr key={row.id}>
                            <td><a href={row.html_url}>{row.id}</a></td>
                            <td>{row.title}</td>
                            <td>{row.state}</td>
                        </tr>
                    );
                })}
                </tbody>
            </table>
        );
    }
}

IssuesTable.propTypes = {
    rows: PropTypes.arrayOf(
        PropTypes.shape({
            id: PropTypes.number,
            html_url: PropTypes.string,
            title: PropTypes.string,
            state: PropTypes.string,
      })
    )
}

export default IssuesTable;