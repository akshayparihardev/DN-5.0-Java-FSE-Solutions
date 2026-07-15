import logo from './logo.svg';
import './App.css';

import React, { Component } from "react";

class CountPeople extends Component {
  constructor(props) {
    super(props);

    this.state = {
      entrycount: 0,
      exitcount: 0,
    };
  }

  UpdateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1,
    }));
  };

  UpdateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1,
    }));
  };

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "80px" }}>
        <div style={{ display: "flex", justifyContent: "space-around" }}>
          <div>
            <button onClick={this.UpdateEntry}>Login</button>
            <span style={{ marginLeft: "10px" }}>
              {this.state.entrycount} People Entered!!
            </span>
          </div>

          <div>
            <button onClick={this.UpdateExit}>Exit</button>
            <span style={{ marginLeft: "10px" }}>
              {this.state.exitcount} People Left!!
            </span>
          </div>
        </div>
      </div>
    );
  }
}

export default CountPeople;