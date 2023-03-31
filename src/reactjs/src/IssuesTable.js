/**
 * React component for displaying the issues in a table.
 * Uses react bootstrap components - https://react-bootstrap.github.io/components/table/
 */
import * as React from 'react';
import PropTypes from 'prop-types';
import Table from 'react-bootstrap/Table';

class IssuesTable extends React.Component {
    PropTypes = {
        rows: PropTypes.arrayOf(
            PropTypes.shape({
                id: PropTypes.number,
                html_url: PropTypes.string,
                title: PropTypes.string,
                state: PropTypes.string,
          })
        )
    }

    render() {
        return (
            <Table striped bordered >
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
            </Table>
        );
    }
}

export default IssuesTable;