import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);

    this.state = {
      amount: "",
      currency: "Euro",
    };
  }

  handleChange = (event) => {
    this.setState({
      amount: event.target.value,
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const euro = (this.state.amount / 90).toFixed(2);

    alert(`Converting to Euro Amount is €${euro}`);
  };

  render() {
    return (
      <div style={{ marginTop: "40px" }}>
        <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <p>
            Amount &nbsp;
            <input
              type="number"
              value={this.state.amount}
              onChange={this.handleChange}
            />
          </p>

          <p>
            Currency &nbsp;
            <input type="text" value={this.state.currency} readOnly />
          </p>

          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;