import logo from './logo.svg';
import './App.css';

import React, { useEffect, useState } from "react";
import GitClient from "./GitClient";

function App() {
  const [repositories, setRepositories] = useState([]);

  useEffect(() => {
    GitClient.getRepositories("techiesyed")
      .then((response) => {
        setRepositories(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  }, []);

  return (
    <div style={{ margin: "30px" }}>
      <h1>Git repositories of User - TechieSyed</h1>

      {repositories.map((repo) => (
        <p key={repo.id}>{repo.name}</p>
      ))}
    </div>
  );
}

export default App;