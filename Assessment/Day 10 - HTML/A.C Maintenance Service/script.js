document.getElementById('acServiceForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const customerName = document.getElementById('customerName').value;
    const acType = document.getElementById('acType').value;
    const serviceType = document.getElementById('serviceType').value;
    const email = document.getElementById('email').value;
    const yearlyMaintenance = document.getElementById('yearlyMaintenance').checked;

    let serviceCharge;

    if (serviceType === "Cleaning") {
        serviceCharge = 1000;
    } else if (serviceType === "Repair" || serviceType === "Gas Refill") {
        serviceCharge = 1500;
    }

    if (yearlyMaintenance) {
        serviceCharge += 1000;
        alert(`Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} with yearly maintenance will be sent to your email ID ${email} and the estimated service charge will be Rs ${serviceCharge}`);
    } else {
        alert(`Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} without yearly maintenance will be sent to your email ID ${email} and the estimated service charge will be Rs ${serviceCharge}`);
    }

    alert('Form submitted successfully!');

    this.reset();
});
