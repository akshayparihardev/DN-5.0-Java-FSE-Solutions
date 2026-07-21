import logo from './logo.svg';
import './App.css';

import React, { useState } from "react";
import EmployeesList from "./EmployeesList";
import ThemeContext from "./ThemeContext";

function App() {
  const [theme, setTheme] = useState("light");

  return (
    <ThemeContext.Provider value={theme}>
      <div style={{ padding: "20px" }}>
        <button
          onClick={() =>
            setTheme(
              theme === "light" ? "dark" : "light"
            )
          }
        >
          Toggle Theme
        </button>

        <EmployeesList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;