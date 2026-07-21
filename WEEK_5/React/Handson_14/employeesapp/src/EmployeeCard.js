import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  const buttonStyle = {
    padding: "8px 15px",
    border: "none",
    cursor: "pointer",
    backgroundColor: theme === "dark" ? "#333" : "#1976d2",
    color: "white",
    borderRadius: "5px",
    marginTop: "10px",
  };

  return (
    <div
      style={{
        border: "1px solid #ccc",
        padding: "15px",
        margin: "15px",
        borderRadius: "8px",
      }}
    >
      <h3>{employee.name}</h3>
      <p>Designation: {employee.designation}</p>

      <button style={buttonStyle}>
        View Details
      </button>
    </div>
  );
}

export default EmployeeCard;