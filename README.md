# Camera2

## Introduction
Camera2 is the replacement for the depricated camera class in android studio. It is the new android camera API which gives an interface to all the camera devices connected to the selected android device. This is used to click picture using the camera, image capture settings,start/stop preview, and snap pictures. Camera2 is better than previous camera version because of the more manual control and pipeline model.

## History
Camera2 has been added in API level 21 and supports till level 28. It is the replacement of the old camera class. 
Package library is android.hardware.camera2.

## Major Methods/Attributes 
### Classes
#### CameraCaptureSession
A configured capture session for taking pictures from camera. It sets up the image capture data flow.
CameraCaptureSession.CaptureCallback: 

#### CameraManager
It lists all the availaible cameras, provides access to their properties and allows to open the camera.
CameraManager.AvailabilityCallback:  Callback for camera devices which become open or closed.

#### CameraDevice
Gives you exclusive access to a camera. Also it allows to create a CameraCaptureSession.
CameraDevice.StateCallback: Gives update about the state of camera device.
#### CaptureRequest
PAckage of settings and result required to click an image from device.

## Sequence
![camera2 0](https://user-images.githubusercontent.com/43179715/49777601-3573a000-fccf-11e8-9e9b-43690ae7b8f8.PNG)




## References

https://developer.android.com/reference/android/hardware/camera2/
https://pierrchen.blogspot.com/2015/01/android-camera2-api-explained.html

