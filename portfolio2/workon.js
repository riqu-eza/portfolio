// script.js
window.addEventListener('load', () => {
    const endpoint = 'http://your-api-endpoint.com/work-point';
    const duration = 5000; // Duration in milliseconds for the counting animation
    const endValue =999; // Desired end value for the work point
    
    const increment = endValue / (duration / 100); // Increment value per 100 milliseconds
    
    let currentValue = 0;
    
    const updateWorkPoint = () => {
        currentValue += increment;
        if (currentValue >= endValue) {
            currentValue = endValue;
            clearInterval(interval);
        }
        document.getElementById('work-point').textContent = Math.floor(currentValue);
        document.getElementById('work-on').textContent = Math.floor(currentValue);
    };
    
    const interval = setInterval(updateWorkPoint, 100); // Update every 100 milliseconds
});

