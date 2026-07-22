import logo from './logo.svg';
import './App.css';

import React from "react";
import CohortData from "./Cohort";
import CohortDetails from "./CohortDetails";

function App() {
  return (
    <div>
      <h1>Cohort Tracker</h1>

      {CohortData.map((cohort) => (
        <CohortDetails
          key={cohort.id}
          cohort={cohort}
        />
      ))}
    </div>
  );
}

export default App;