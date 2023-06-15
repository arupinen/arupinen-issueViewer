This is a small app written in Spring Java and React JS to pull the issues from a GitHub repo and display some of the core data.
See https://docs.github.com/en/rest/issues/issues?apiVersion=2022-11-28#list-repository-issues for the GitHub API docs

The barebones spring portion of this app was built using Spring Initializr (https://start.spring.io/)
The react portion was built using `npx create-react-app reactjs`

### Prerequisites
This application requires that you have downloaded node, and have the appropriate Java, SpringBoot, and React plugins installed to your IDE OR that you have Docker installed and run the application that way.

Before attempting to run the application, make sure the pom and node_module dependencies are installed.
For Java, this can be done by right-clicking the pom.xml file are selecting reload project, or running `mvn clean install`
For React, this can be done by running `npm install` in the reactjs folder

### Running the app
To run the Spring Java backend, run `IssueViewerApplication.java`
To run the React frontend, navigate to the reactjs folder via console and run `npm start`

The app can be accessed at http://localhost:3000/

### Running the app with Docker
From the issueViewer folder, run `docker-compose up`