import React from 'react';
import axios from 'axios';
import Pagination from "react-js-pagination";

import TableData  from './tableWithData.js';


class Statements extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      creditCardsDetails: [],
      activePage:1,
      totalPages: null,
      itemsCountPerPage:null,
      totalItemsCount:null
    };
    this.handlePageChange = this.handlePageChange.bind(this);
    this.fetchURL = this.fetchURL.bind(this);
  }

  fetchURL(page) {

    axios.get(`http://localhost:8080/creditCards?page=${page}&limit=10`)
      .then( response => {

          const totalPages = response.data.totalPages;
          const itemsCountPerPage = response.data.size;
          const totalItemsCount = response.data.totalElements;

          this.setState({totalPages: totalPages})
          this.setState({totalItemsCount: totalItemsCount})
          this.setState({itemsCountPerPage: itemsCountPerPage})

          const results = response.data.content;

          const updatedResults = results.map(results => {
            return {
                ...results,
              }
            });

            this.setState({creditCardsDetails: updatedResults});
            console.log(updatedResults);
            console.log(this.state.activePage);
            console.log(this.state.itemsCountPerPage);

        }
      );
    }


  componentDidMount () {
      this.fetchURL(this.state.activePage)
    }

  handlePageChange(pageNumber) {
    console.log(`active page is ${pageNumber}`);
    this.setState({activePage: pageNumber})
    this.fetchURL(pageNumber)

    }

    populateRowsWithData = () => {
      const userData = this.state.creditCardsDetails.map(user => {
          return <TableData
            key = {user.id}
            id = {user.id}
            name = {user.name}
            balance = {user.limit_BAL}
            age = {user.age}
          />;
      });

      return userData
    }

  render(){
    return (
      <div>
      <table className="table table-striped">
        <thead>
          <tr>
            <th scope="col">UserID</th>
            <th scope="col">Name</th>
            <th scope="col">Age</th>
            <th scope="col">Balance</th>
          </tr>
        </thead>
        <tbody>
          {this.populateRowsWithData()}
        </tbody>
      </table>
      <div className="d-flex justify-content-center">
        <Pagination
         hideNavigation
         activePage={this.state.activePage}
         itemsCountPerPage={this.state.itemsCountPerPage}
         totalItemsCount={this.state.totalItemsCount}
         pageRangeDisplayed={10}
         itemClass='page-item'
         linkClass='page-link'
         onChange={this.handlePageChange}
         />
       </div>
      </div>
    );
  }
}

export default Statements;
