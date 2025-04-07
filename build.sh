#!/bin/bash

set -eo pipefail

IMAGE_NAME="regretboard:latest"
EXPORT_DIR="./docker/image"
DOCKER_COMMAND="podman"

mkdir -p "$EXPORT_DIR"

# Build the image
"$DOCKER_COMMAND" build -t $IMAGE_NAME .

# Save the image as a tar file
"$DOCKER_COMMAND" save $IMAGE_NAME -o "$EXPORT_DIR/regretboard.tar"

echo "Image $IMAGE_NAME saved to $EXPORT_DIR/regretboard.tar"