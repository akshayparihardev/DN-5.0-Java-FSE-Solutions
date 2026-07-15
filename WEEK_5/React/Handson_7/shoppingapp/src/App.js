import logo from './logo.svg';
import './App.css';

import React from "react";
import Cart from "./Cart";

class OnlineShopping extends React.Component {

  carts = [
    new Cart("Laptop", 65000),
    new Cart("Mobile", 25000),
    new Cart("Headphones", 2500),
    new Cart("Keyboard", 1800),
    new Cart("Mouse", 900)
  ];

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <h1>Shopping Cart</h1>

        <table border="1" cellPadding="10">
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price (₹)</th>
            </tr>
          </thead>

          <tbody>
            {this.carts.map((item, index) => (
              <tr key={index}>
                <td>{item.itemName}</td>
                <td>{item.price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;