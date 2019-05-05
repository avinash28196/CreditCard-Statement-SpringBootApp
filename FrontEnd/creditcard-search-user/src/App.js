import React from 'react';
import axios from 'axios';
import SearchField from "react-search-field";
import {XYPlot, XAxis, YAxis, HorizontalGridLines, LineSeries,VerticalGridLines,VerticalBarSeries} from 'react-vis';
import DiscreteColorLegend from 'react-vis/dist/legends/discrete-color-legend';
import './App.css';
import '../node_modules/react-vis/dist/style.css';

const ITEMS = [
  {title: 'Amount Paid', color: 'powderblue', strokeWidth: 10},
  {title: 'Bill Paid', color: '#45aeb1', strokeWidth: 10},
];

export default class App extends React.Component {

  state = {
    user: [],
    bill_amt1: null,
    bill_amt2: null,
    bill_amt3: null,
    bill_amt4: null,
    bill_amt5: null,
    bill_amt6: null,

    pay_amt1: null,
    pay_amt2: null,
    pay_amt3: null,
    pay_amt4: null,
    pay_amt5: null,
    pay_amt6: null,

    limit_BAL: null,
    name:null,
    id:null,

    searchId: null



  }


  componentDidMount() {
   axios.get(`http://localhost:8080/creditCards/find/543231`)
     .then(res => {
       const user = res.data;
       console.log(user.content[0].name);
       this.setState({ bill_amt1 : user.content[0].bill_AMT1});
       this.setState({ bill_amt2 : user.content[0].bill_AMT2});
       this.setState({ bill_amt3 : user.content[0].bill_AMT3});
       this.setState({ bill_amt4 : user.content[0].bill_AMT4});
       this.setState({ bill_amt5 : user.content[0].bill_AMT5});
       this.setState({ bill_amt6 : user.content[0].bill_AMT6});

       this.setState({ pay_amt1 : user.content[0].pay_AMT1});
       this.setState({ pay_amt2 : user.content[0].pay_AMT2});
       this.setState({ pay_amt3 : user.content[0].pay_AMT3});
       this.setState({ pay_amt4 : user.content[0].pay_AMT4});
       this.setState({ pay_amt5 : user.content[0].pay_AMT5});
       this.setState({ pay_amt6 : user.content[0].pay_AMT6});

       this.setState({ id : user.content[0].id})
       this.setState({ name : user.content[0].name})
       this.setState({ balance : user.content[0].limit_BAL})
       this.setState({ user });
       //console.log(this.state.bill_amt1);
     })
   }

   onChange(){
     console.log("Enterd text is:");
   }



  render() {
    const bill_amounts = [
      {x: 10000, y: this.state.bill_amt1},
      {x: 20000, y: this.state.bill_amt2},
      {x: 30000, y: this.state.bill_amt3},
      {x: 40000, y: this.state.bill_amt4},
      {x: 50000, y: this.state.bill_amt5},
      {x: 60000, y: this.state.bill_amt6}
    ];

    const amount_paid = [
      {x: 10000, y: this.state.pay_amt1},
      {x: 20000, y: this.state.pay_amt2},
      {x: 30000, y: this.state.pay_amt3},
      {x: 40000, y: this.state.pay_amt4},
      {x: 50000, y: this.state.pay_amt5},
      {x: 60000, y: this.state.pay_amt6}
    ];


    return (
      <div className="App">
        <hr/>
        <SearchField
          classNames="form-inline md-form form-lg mt-0"
          placeholder="Search..."
          onChange={this.onChange}
          searchText=""
          classNames="test-class"
          />
          <hr/>


        <div align="center">
        <h4>Customer Id: {this.state.id} | Customer Name:{this.state.name}</h4>
        <h5>Available Balance: {this.state.balance}</h5>
          <XYPlot margin={{bottom: 100}} xType="ordinal" width={600} height={600}>
                <VerticalGridLines />
                <HorizontalGridLines />
                <XAxis tickLabelAngle={-45} />
                <YAxis tickLabelAngle={-55}/>
                <VerticalBarSeries data={amount_paid} />
                <VerticalBarSeries data={bill_amounts}  fill="#45aeb1"/>
                </XYPlot>
           <DiscreteColorLegend orientation="horizontal" width={400} items={ITEMS} />
         </div>
      </div>

    );
  }
}
