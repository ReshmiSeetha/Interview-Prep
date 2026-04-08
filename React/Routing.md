Routing
    Routing is the process of navigating between different pages in a web application.
    In React, we use **React Router** for routing.
    React Router is a library that provides routing functionality to React applications.

Implement Routing in React
    1. Install React Router
        npm install react-router-dom
    2. Create Routes
        import { BrowserRouter, Routes, Route,Link } from 'react-router-dom';
        function App() {
            return (
                <BrowserRouter>
                    <Routes>
                        <Route path="/" element={<Home />} />
                        <Route path="/about" element={<About />} />
                        <Route path="/contact" element={<Contact />} />
                    </Routes>
                </BrowserRouter>
            );
        }
    3. Create Components
        function Home() {
            return <h1>Home</h1>;
        }
        function About() {
            return <h1>About</h1>;
        }
        function Contact() {
            return <h1>Contact</h1>;
        }
    4. Export App
        export default App;

Roles of <Routes> and <Route>
    <Routes> - It is a component that is used to define the routes in a React application.
    <Route> - It is a component that is used to define a route in a React application which specifies a component that will render when route specifies with the path.
    <BrowserRouter> - It is a component that is used to enable routing in a React application.
    <Link> - It is a component that is used to create a link to a route in a React application.

Route Parameters are some dynamic data selected by the User from the Ui and passed to the component present in that route.
    Example: User selects a product from the list and the product id is passed to the product details component.