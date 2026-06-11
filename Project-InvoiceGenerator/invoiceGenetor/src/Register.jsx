import { useState } from "react";
import axios from "axios";

function Register({ setIsLogin }) {
  const [form, setForm] = useState({
    name: "",
    email: "",
    password: "",
  });

  const handleChange = (e) => {
    setForm({
      ...form,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const res = await axios.post(
        "http://localhost:5000/api/auth/register",
        form
      );

      alert("Registration Successful 🎉");
      setIsLogin(true);

    } catch (error) {
      alert(error.response?.data?.message || "Register Failed");
    }
  };

  return (
    <>
      <h2>Create Account</h2>

      <form onSubmit={handleSubmit}>
        <input
          className="auth-input"
          type="text"
          name="name"
          placeholder="Enter Name"
          onChange={handleChange}
          required
        />

        <input
          className="auth-input"
          type="email"
          name="email"
          placeholder="Enter Email"
          onChange={handleChange}
          required
        />

        <input
          className="auth-input"
          type="password"
          name="password"
          placeholder="Enter Password"
          onChange={handleChange}
          required
        />

        <button className="auth-btn">
          Register
        </button>
      </form>
    </>
  );
}

export default Register;