import logo from './logo.svg';
import './App.css';

import React, { useState } from "react";

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function GuestGreeting() {
  return (
    <div>
      <h1>Please sign up.</h1>

      <h2>Flight Details</h2>

      <p>Flight: AI-202</p>
      <p>From: Nagpur</p>
      <p>To: Mumbai</p>
      <p>Status: Available</p>
    </div>
  );
}

function UserGreeting() {
  return (
    <div>
      <h1>Welcome back</h1>

      <h2>Flight Details</h2>

      <p>Flight: AI-202</p>
      <p>From: Nagpur</p>
      <p>To: Mumbai</p>

      <button>Book Ticket</button>
    </div>
  );
}

function Greeting(props) {
  if (props.isLoggedIn) {
    return <UserGreeting />;
  }

  return <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ margin: "80px" }}>
      <Greeting isLoggedIn={isLoggedIn} />

      <br />

      {isLoggedIn ? (
        <LogoutButton onClick={() => setIsLoggedIn(false)} />
      ) : (
        <LoginButton onClick={() => setIsLoggedIn(true)} />
      )}
    </div>
  );
}

export default App;