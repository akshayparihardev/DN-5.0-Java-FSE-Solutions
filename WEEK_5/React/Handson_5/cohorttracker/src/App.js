import logo from './logo.svg';
import './App.css';

import CohortDetails from "./components/CohortDetails";
import cohorts from "./cohortData";
import styles from "./CohortDetails.module.css";

function App() {
  return (
    <div className={styles.container}>
      <h1>Cohorts Details</h1>
      <h2>Hello Dev!</h2>
      <div className={styles.cardContainer}>
        {cohorts.map((cohort) => (
          <CohortDetails
            key={cohort.id}
            cohort={cohort}
          />
        ))}
      </div>
    </div>
  );
}

export default App;