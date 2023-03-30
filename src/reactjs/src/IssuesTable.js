import * as React from 'react';
import PropTypes from 'prop-types';
import { DataGrid, GridColDef, GridValueGetterParams } from '@mui/x-data-grid';

const columns = [
    { field: 'id', headerName: 'ID', width: 90 },
    {
      field: 'url',
      headerName: 'First name',
      width: 150,
      editable: true,
    },
    {
      field: 'title',
      headerName: 'Last name',
      width: 150,
      editable: true,
    },
    {
      field: 'state',
      headerName: 'Age',
      type: 'number',
      width: 110,
      editable: true,
    },
  ];
class IssuesTable extends React.Component {
    render() {
        return (
        // <TableContainer component={Paper}>
        // <Table aria-label="collapsible table">
        //     <TableHead>
        //     <TableRow>
        //         <TableCell />
        //         <TableCell>ID</TableCell>
        //         <TableCell align="right">URL</TableCell>
        //         <TableCell align="right">TITLE</TableCell>
        //         <TableCell align="right">STATE</TableCell>
        //     </TableRow>
        //     </TableHead>
        //     <TableBody>
        //     {rows.map((row) => (
        //         <Row key={row.id} row={row} />
        //     ))}
        //     </TableBody>
        // </Table>
        // </TableContainer>
          <div style={{ height: 400, width: '100%' }}>
            {/* <DataGrid
              rows={rows}
              columns={columns}
              pageSize={5}
              rowsPerPageOptions={[5]}
              checkboxSelection
            /> */}
              <DataGrid
                rows={props.rows}
                columns={columns}
                initialState={{
                pagination: {
                    paginationModel: {
                    pageSize: 5,
                    },
                },
                }}
                pageSizeOptions={[5]}
                checkboxSelection
                disableRowSelectionOnClick
            />
          </div>
        );
    }
}
IssuesTable.PropTypes = {
    rows: PropTypes.shape({
        id: PropTypes.number,
        url: PropTypes.string,
        title: PropTypes.string,
        state: PropTypes.string,
      })
}

export default IssuesTable;