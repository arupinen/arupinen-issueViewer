# ==== CONFIGURE =====
# Use a Node 18 base image
FROM node:18-alpine 
# Set the working directory to /reactjs inside the container
WORKDIR /reactjs

# install js dependencies
COPY package.json .
COPY package-lock.json .
# install js dependencies
RUN npm install

# Copy app files
COPY . .

# Expose the port on which the app will be running (3000 is the default that `serve` uses)
EXPOSE 3000
# Start the app
CMD [ "npm", "start" ]