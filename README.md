# Find-Me-A-Bus

## About Project
My city actually has about 12 actively working bus lines, working in two directions, meaning that you can takie 24 unique journeys. Today it can be problematic to find the best one to reach your destiny. And city is growing, which means that there is a possibility to open more bus lines in the future. Making it even harder to find which bus to take.
By this reason I decided to create this project of website, where basing on bus schedule available on Internet, it will automatically search it for your requirements, giving you in return the best possible buses with departure and arrival times. It will even include option of transfering between lines.

## Main Functionality
User will choose from list a bus stops as a place of origin and place of destiny and input a time, which he will choose if it is a time of departure or arrival. Basing on such a information, website will search through bus schedule and return result. A single result will consist of information about when bus departures from bus stop and when it arrives to destined bus stop. If transfer between lines is needed, it will show exactly needed information to do it succesfully.
To optimize inner work of project, it will .transfer bus schedule from official website and save it in database. This will be made always when website will be launched. Any request sent by client will be realised basing on this database.
Admin after logging succesfully will have a tool to manually update database if bus schedule is changed. This will allow to keep database of bus schedule up-to-date, without the need of restarting website.

## Additional Functionalities
Users will have a possibility to login and save on account favourite routes. This will allow to quickly get results for a route chosen frequently, without need to input information every single time.
Admin will have a tool to display warnings for users in case of some unexpected errors.
There will be added a role of moderators, allowing them to communicate with clients if they will have any issues regarding website.

## Used Technologies
In this project I used Java 8, Spring (boot, data, security), Hibernate, JSP, MySQL and Lombok.
