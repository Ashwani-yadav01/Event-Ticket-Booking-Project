import { useEffect } from "react";
import { useAuth } from "react-oidc-context";
import { useNavigate } from "react-router";

const CallbackPage: React.FC = () => {
  const auth = useAuth();
  const navigate = useNavigate();

  useEffect(() => {
    if (!auth.isLoading && auth.isAuthenticated) {
      const redirectPath = localStorage.getItem("redirectPath") || "/dashboard";
      localStorage.removeItem("redirectPath");
      navigate(redirectPath);
    } else if (!auth.isLoading && auth.error) {
      console.error("OIDC Login Error:", auth.error);
    }
  }, [auth.isLoading, auth.isAuthenticated, auth.error, navigate]);

  return <p>Completing login...</p>;
};

export default CallbackPage;
