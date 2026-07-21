import React, { Component } from "react";

class GetUser extends Component {
  constructor(props) {
    super(props);

    this.state = {
      person: null,
      loading: true,
      error: null,
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch("https://api.randomuser.me/");
      const data = await response.json();

      this.setState({
        person: data.results[0],
        loading: false,
      });
    } catch (error) {
      this.setState({
        error: "Failed to fetch user.",
        loading: false,
      });
    }
  }

  render() {
    const { person, loading, error } = this.state;

    if (loading) {
      return <h2>Loading...</h2>;
    }

    if (error) {
      return <h2>{error}</h2>;
    }

    return (
      <div
        style={{
          marginTop: "60px",
          marginLeft: "100px",
        }}
      >
        <h1>
          {person.name.title} {person.name.first}
        </h1>

        <img
          src={person.picture.large}
          alt={person.name.first}
        />
      </div>
    );
  }
}

export default GetUser;