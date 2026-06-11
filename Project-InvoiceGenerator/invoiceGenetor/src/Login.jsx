import { useState } from "react";
import axios from "axios";

function Login({ setIsLogin }) {
  const [form, setForm] = useState({
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
        "http://localhost:5000/api/auth/login",
        form
      );

      // Token save
      localStorage.setItem("token", res.data.token);

      alert("Login Successful 🎉");

      console.log("Token:", res.data.token);

      // Yahan baad me dashboard par redirect kar sakte ho

    } catch (error) {
      alert(
        error.response?.data?.message || "Login Failed ❌"
      );
    }
  };

  return (
    <>
      <h2>Login</h2>

      <form onSubmit={handleSubmit}>
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

        <button className="auth-btn" type="submit">
          Login
        </button>
      </form>

      <p className="auth-link">
        Don't have an account?{" "}
        <span onClick={() => setIsLogin(false)}>
          Register
        </span>
      </p>
    </>
  );
}

export default Login;