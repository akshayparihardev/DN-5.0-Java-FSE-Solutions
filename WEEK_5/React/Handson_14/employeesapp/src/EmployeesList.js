import React from "react";
import EmployeeCard from "./EmployeeCard";

function EmployeesList() {
  const employees = [
    {
      id: 1,
      name: "John Doe",
      designation: "Software Engineer",
    },
    {
      id: 2,
      name: "Jane Smith",
      designation: "Project Manager",
    },
    {
      id: 3,
      name: "Robert Brown",
      designation: "QA Engineer",
    },
  ];

  return (
    <div>
      <h1>Employee List</h1>

      {employees.map((employee) => (
        <EmployeeCard
          key={employee.id}
          employee={employee}
        />
      ))}
    </div>
  );
}

export default EmployeesList;