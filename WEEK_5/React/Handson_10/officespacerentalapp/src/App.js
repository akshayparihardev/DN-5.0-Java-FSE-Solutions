import logo from './logo.svg';
import './App.css';
import React from "react";

function App() {
  const officeSpaces = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image:
        "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=500",
    },
    {
      name: "WeWork",
      rent: 75000,
      address: "Bangalore",
      image:
        "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=500",
    },
    {
      name: "Regus",
      rent: 55000,
      address: "Hyderabad",
      image:
        "https://images.unsplash.com/photo-1497366216548-37526070297c?w=500",
    },
  ];

  return (
    <div style={{ marginLeft: "40px" }}>
      <h1>Office Space, at Affordable Range</h1>

      {officeSpaces.map((office, index) => (
        <div key={index} style={{ marginBottom: "40px" }}>
          <img
            src={office.image}
            alt={office.name}
            width="250"
            height="180"
          />

          <h2>Name: {office.name}</h2>

          <h3
            style={{
              color: office.rent < 60000 ? "red" : "green",
            }}
          >
            Rent: Rs. {office.rent}
          </h3>

          <h3>Address: {office.address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;