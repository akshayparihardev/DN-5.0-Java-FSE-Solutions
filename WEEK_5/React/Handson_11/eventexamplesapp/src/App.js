import logo from './logo.svg';
import './App.css';
import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1,
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1,
    });
  };

  sayHello = () => {
    alert("Hello! Member1");
  };

  incrementAndHello = () => {
    this.increment();
    this.sayHello();
  };

  welcome = (message) => {
    alert(message);
  };

  onPress = () => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <h2>{this.state.count}</h2>

        <button onClick={this.incrementAndHello}>
          Increment
        </button>

        <br />
        <br />

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br />
        <br />

        <button
          onClick={() => this.welcome("welcome")}
        >
          Say Welcome
        </button>

        <br />
        <br />

        <button onClick={this.onPress}>
          Click on me
        </button>

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;