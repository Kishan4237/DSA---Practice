import { useState } from "react";
import Login from "./Login";
import Register from "./Register";
import "./Login.css";

function App() {
  const [isLogin, setIsLogin] = useState(true);

  return (
    <div className="auth-container">
      <div className="auth-card">
        {isLogin ? (
          <Login setIsLogin={setIsLogin} />
        ) : (
          <Register setIsLogin={setIsLogin} />
        )}
      </div>
    </div>
  );
}

export default App;