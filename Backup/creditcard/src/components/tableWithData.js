import React from 'react';


function TableData (props) {
  return (

      <tr>
        <th scope="row">{props.id}</th>
        <td>{props.name}</td>
        <td>{props.age}</td>
        <td>{props.balance}</td>
      </tr>

  );
}

export default TableData;
