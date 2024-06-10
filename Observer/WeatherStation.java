// The Observer design pattern is a behavioral design pattern that defines a one-to-many relationship between objects so that when one object changes state, all its dependents are notified and updated automatically. This pattern is particularly useful for implementing distributed event-handling systems.
// Eg: Weather Station
// Benefits:
	// Loose Coupling: Subjects and observers are loosely coupled. The subject only knows the observers through the observer interface, which allows for flexibility and scalability.
	// Dynamic Relationships: Observers can be added or removed at runtime, making the system more flexible.
	// Event Handling: Useful for implementing distributed event-handling systems where a change in one part of the system needs to be communicated to other parts.

package Observer;

public class WeatherStation {

	public static void main(String[] args) {
		// created a new subject
		WeatherData weatherData = new WeatherData();

		// created new subscribers
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		// this is a bad one !
//		currentDisplay.update();
//		statisticsDisplay.update();
//		forecastDisplay.update();
		// heatIndexDisplay.update();

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

		currentDisplay.deregister();
		weatherData.setMeasurements(62, 90, 28.1f);
		currentDisplay.registerToGetUpdates();
		weatherData.setMeasurements(99, 90, 28.1f);
	}
}
