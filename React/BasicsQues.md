What is react and Role of React in Software development?
    For Example : As user we launch an application it will hit the UI server/client/frontend which is a static html content. But for dynamic like list of orders UI will send request to API(middleWare) which process bussiness logic then API will hit the DB(Backend) and fetch the data and send it back to UI. UI will display the data to the user.

    React is open source js library
    Used for building user interfaces
    React simplifies the creation of Single Page Applications(SPA) by using reusable components.

Key Features of React:
    1. Component Based Architecture
    2. Virtual DOM
    3. JSX
    4. One Way Data Binding
    5. Declarative UI
    6. React Hooks
    7. Large Ecosystem
    
DOM
    Document Object Model
    Tree like representation of HTML elements
    It is a programming interface for web documents.
    It represents the page structure as a tree of objects, where each object represents a node in the tree.

    Add/update/Delete is done in website via javascript and new elements are added to the DOM Tree.

    This Update DOM will be converted back to HTML and displayed to the user.

    This process is slow and time consuming.

**DOM is a tree structure representation of HTML created by the browser.**
**It allows JavaScript to dynamically access and update elements.**
**React uses a Virtual DOM to optimize performance by reducing direct DOM updates.**

Virtual DOM
    Only specific to react , to improve the speed of the application.
    In Real DOM , even if there is a small change in the application the entire DOM is re-rendered it takes time and leads to performance problem.
    In Virtual DOM , only the specific part of the DOM is re-rendered.   

**Virtual DOM is a lightweight JavaScript representation of the real DOM used by React.**
**When state changes, React creates a new Virtual DOM, compares it with the previous one using diffing, and updates only the changed elements in the real DOM.**
**This improves performance by reducing direct DOM manipulation.**

What are React Components
    React Components are the building blocks of a React application.
    They are independent, reusable pieces of UI that can be composed together to create complex interfaces.
    Components can be written as functions or classes.

        Example:
        import React from 'react';
        function Welcome(props) {
            return <h1>Hello, {props.name}</h1>;
        }

        export default Welcome;

Single Page Application(SPA)
    A single page application is a web application that loads a single HTML page and dynamically updates the content of that page without reloading the entire page as the user interacts with the application.

5 Advantages of React:
    1.Simple to build Single Page Applications(by using Components)
    2.Cross Platform and Open Scource
    3.LightWeight and fast
    4.Supported by large community and Ecosystem
    5.Testing UI with react is easy

5 Disadvantages of React:
    Since react has steep learning curve it's difficult for simple static applications.
    It's a library not a framework so we need to use other libraries for routing, state management, etc.
    

What is the role of JSX in React?
    Java Script XML
    JSX is converted to JS bcz browsers understand only JS not JSX.
    Conversion is done by react babel library.
    JSX is used to write HTML in JS.It's simple to write the code.

Declarative & Imperative Syntax
    Declarative Syntax: returining html like code
    Focusing more on what to display rather than how to display
        function App(){
            return (
                <div>
                    <h1>Hello, World!</h1>
                </div>
            );
        }
    Imperative Syntax: 
        Step by Step
        function App(){
            const heading = document.createElement('h1');
            heading.textContent = 'Hello, World!';
            document.body.appendChild(heading);
        }

Arrow Function Expressions in JSX
    Arrow functions are a **concise way to write functions** in JavaScript.
    They are often used in React to write components.

        Example:
        const Welcome = (props) => {
            return <h1>Hello, {props.name}</h1>;
        };

        export default Welcome;

How to Setup React Project
    1. Install Node.js and npm
    2. npx create-react-app my-app
    3. cd my-app
    4. npm start

Main Files in React Project:
    1. index.html
    2. index.js
    3. App.js
    4. App.css
    5. index.css
How React App Load and display the components in browser
    User Request ->index.html ->index.js ->App.js(Root Component) ->App.css ->index.css ->Virtual DOM ->Real DOM ->Browser   


Resusability and Composition
    Resusability: Reusability is the ability to use the same code in multiple places.
    Composition: Composition is the ability to combine multiple components to create a complex UI.

State, stateless, stateful and state management
    State: State is a JavaScript object that contains the data that the component needs to display.
    Stateless: Stateless components are components that do not have state.
    Stateful: Stateful components are components that have state. Perform action then update or re render that data on the UI
    State Management: State management is the process of managing the state of a component.

Props in jsx
    Props are used to pass data from a parent component to a child component.
    Props are read-only and cannot be modified by the child component.
    Props are passed as attributes to the child component.

        Example:
        function Welcome(props) {
            return <h1>Hello, {props.name}</h1>;
        }

        export default Welcome;

What is NPM and role of node_modules
    NPM is a package manager for JavaScript.
    It is used to install, update, and manage packages in a React project.
    node_modules is a folder that contains all the packages that are installed in a React project.

public Folder in react
    The public folder in a React project is a folder that contains all the **static files** that are not processed by the build process.
    It is a folder that contains all the static files that are not processed by the build process.

SRC Folder
    All the source code written in react is stored in this folder.
    
Can we have multiple root components in react?
    No, we can have only one root component in react.
    
Function without a return statement in react?
    No, we cannot have a function without a return statement in react.
    
export and import in react
    Export is used to export a component from a file.
    Import is used to import a component from a file.
    
Does the fileName and ComponentName have to be same in react?
    No, the fileName and ComponentName does not have to be same in react.
    But it is a good practice to have the same fileName and ComponentName in react.

What are React Hooks 
    Hooks are inBuilt functions present in react library that allow functional components to use state and other react features.
    