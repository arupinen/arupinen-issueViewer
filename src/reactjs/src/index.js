import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // StrictMode will cause components to render twice in dev, but should not in prod
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
