# Import the necessary packages:

from picamera.array import PiRGBArray
from picamera import PiCamera
import time
import cv2

# Initialize the camera and grab a reference to the raw camera capture:
camera = PiCamera()
camera.resolution = (640, 480)
camera.framerate = 32
rawCapture = PiRGBArray(camera, size = (640, 480))

# Allow the camera to warmup:
time.sleep(0.1)

# Capture frames from the camera:\
for frame in camera.capture_continuous(rawCapture, format = "bgr", use_video_port = True):
    # Grab the raw Numpy array representing the image, then initialize the timestamp
    # and occupied/unoccupied test
    
    image = frame.array
    
    # Show the frame:
    cv2.imshow("Frame", image)
    key = cv2.waitKey(1) & 0XFF
    
    # Clear the stream in preparation for the next frame
    rawCapture.truncate(0)
    
    # If the 'q' key was pressed, break from the loop:
    if key == ord("q"):
        break
