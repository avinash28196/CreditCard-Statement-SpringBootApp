import React, { Component } from 'react';

import './App.css';

import Header from './components/header.js';
import Statements  from './components/statements.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Header />
        <Statements />
      </div>
    );
  }
}

export default App;
