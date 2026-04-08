React Hooks
    Hooks are inBuilt functions present in react library that allow functional components to use state and other react features.
Top React Hooks:
    1. useState -State
    2. useEffect - Side Effects
    3. useContext - Context
    4. useReducer - Complex state
    5. useRef - Refs
    6. useMemo - Performance
    7. useCallback - Memoization
    8. useImperativeHandle - Imperative
    9. useLayoutEffect - Synchronous Side effects.
    10. useDebugValue - Debugging

UseState()
    It is used to manage the **state** of a component.
    It is a function that returns an array of two values:
        1. Current state
        2. Function to update the state
    
    Example:
    import React, { useState } from 'react';
    function Counter() {
        const [count, setCount] = useState(0);
        return (
            <div>
                <p>You clicked {count} times</p>
                <button onClick={() => setCount(count + 1)}>Click me</button>
            </div>
        );
    }
    export default Counter;

Role of UseEffect
    When we launch an application few data are rendenred initially, but few will take time to load. So we use useEffect to load the data in background(Eg: Loading data from external API, DOM manipulation, Event Listeners, etc.).

Used to perform **side effects** in a functional component.
Called after the component is rendered.

function useEffect(callback, dependencies) {
    // callback - function to be executed
    // dependencies - array of values that will trigger the effect
}

Accepts 2 parameters:
    1. Callback function
    2. Dependency array
    
    Example:
    import React, { useEffect } from 'react';
    function Counter() {
        const [count, setCount] = useState(0);
        useEffect(() => {
            alert(`You clicked ${count} times`)
        }, [count]);
        return (
            <div>
                <p>You clicked {count} times</p>
                <button onClick={() => setCount(count + 1)}>Click me</button>
            </div>
        );
    }
    export default Counter;
    API Example:
    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => console.log(data))
    }, []);

Dependency Array:
    1. Empty array - Runs only once after the initial render
    2. Array with values - Runs only when the values in the array change
    3. No array - Runs after every render

useContext()
    Provides a way to pass data from a parent component to a child component without using props.
    It's one way to handle the prop drilling.
    Prop drilling is when props are passed through multiple layers of components, even if intermediate components don’t need the data, just to reach a deeply nested child.

    Example:
    import React, { createContext, useContext } from 'react';
    const ThemeContext = createContext('light');
    Object returned by the createContext will have 2 properties:
        1. Provider - Parent Component
        2. Consumer - Child Component
    //We will pass the child component inside the Provider so that we don't need to pass props to the child component.
    function App() {
        return (
            <ThemeContext.Provider value="dark">
                <ThemedButton />
            </ThemeContext.Provider>
        );
    }
    function Toolbar(){
        return(
            <ThemedButton />
        )
    }
    function ThemedButton() {
        const theme = useContext(ThemeContext);//this will return the value and we can use it here
        return (
            <button style={{ background: theme === 'dark' ? 'black' : 'white', color: theme === 'dark' ? 'white' : 'black' }}>
                I am a button
            </button>
        );
    }

    Instead of useContext we can also use .Consumer also

What is createContext()?
    It is used to create a context object.
    It is a function that returns an object with two properties:
        1. Provider - Parent Component
        2. Consumer - Child Component

What is useReducer()?
    It is used to manage the **state** of a component.
    It is a function that returns an array of two values:
        1. Current state
        2. Function to update the state
    
    Example:
    import React, { useReducer } from 'react';
    function Counter() {
        const [count, setCount] = useReducer((state, action) => {
            //Reducer function takes two parameters:
            //1. Current state
            //2. Action
            if (action.type === 'increment') {
                return state + 1;
            }
            return state;
        }, 0);
        return (
            <div>
                <p>You clicked {count} times</p>
                <button onClick={() => setCount({ type: 'increment' })}>Click me</button>
            </div>
        );
    }
    export default Counter;

When to use useReducer() instead of useState()?
    When the state is complex and involves multiple values
    When the state updates depend on the previous state
    When the state updates involve multiple steps

useRef()

It is used to create a **reference** to a DOM element.
It is a function that returns an object with one property:
    1. current - The value of the reference

    Example:
    import React, { useRef } from 'react';
    function Counter() {
        const count = useRef(0);
        return (
            <div>
                <p>You clicked {count.current} times</p>
                <button onClick={() => count.current++}>Click me</button>
            </div>
        );
    }
    export default Counter;

useMemo()

It is used to **memoize** a value.
It is a function that returns a value.

    Example:
    import React, { useMemo } from 'react';
    function Counter() {
        const count = useMemo(() => {
            return 0;
        }, []);
        return (
            <div>
                <p>You clicked {count} times</p>
                <button onClick={() => count++}>Click me</button>
            </div>
        );
    }
    export default Counter;

useCallback()

It is used to **memoize** a function.
It is a function that returns a function.

    Example:
    import React, { useCallback } from 'react';
    function Counter() {
        const count = useCallback(() => {
            return 0;
        }, []);
        return (
            <div>
                <p>You clicked {count} times</p>
                <button onClick={() => count++}>Click me</button>
            </div>
        );
    }
    export default Counter;

    