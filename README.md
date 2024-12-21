## Device Management Application
---
## Description
The Device Management Application is a JavaFX-based program that models various types of electronic devices using object-oriented programming principles. This application allows users to add, view, and remove devices from a dynamic list, supporting three main device types: Smartphones, Laptops, and Tablets. Each device type comes with specific attributes, enabling users to manage device information effectively.

## Key Features
Device Types: Users can manage Smartphones, Laptops, and Tablets.
Dynamic List: Added devices are displayed in a ListView, allowing users to see their entries in real-time.
User-Friendly Interface: The application features a simple navigation system using a TabPane for easy access to different device types.
Input Validation: Basic error handling ensures users provide valid data before adding devices.

https://private-user-images.githubusercontent.com/167278800/381332308-ebb41cf8-ac1c-4ac7-aa7a-95a5e1c7eb1c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzQ3NjA1NTcsIm5iZiI6MTczNDc2MDI1NywicGF0aCI6Ii8xNjcyNzg4MDAvMzgxMzMyMzA4LWViYjQxY2Y4LWFjMWMtNGFjNy1hYTdhLTk1YTVlMWM3ZWIxYy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMjIxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTIyMVQwNTUwNTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xYjhlZTI3NzRjMzhmOTBkYWJiZDAwMjFjMWMwYWVkNTM3MzY3ZDk0ZTA3OGIyNzQ5NjVhYmJmNzEyMzZjZWYzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.5-to6b4YbooTeuaEnu7-3xWq40k-GKWIcxK8XaogHYk
https://private-user-images.githubusercontent.com/167278800/381332381-e7049e13-b0cc-4dcf-86f8-5e01f4eb4187.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzQ3NjA1NTcsIm5iZiI6MTczNDc2MDI1NywicGF0aCI6Ii8xNjcyNzg4MDAvMzgxMzMyMzgxLWU3MDQ5ZTEzLWIwY2MtNGRjZi04NmY4LTVlMDFmNGViNDE4Ny5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMjIxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTIyMVQwNTUwNTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yM2M0ZmE1ODkwNTQ3ZmFlMzdlNzczOTAxNGM3MWNjNGRiYWMxYWZiOTllNWRlMDlhZTNkZTc3M2NiYjEyZDU3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.jU6KA7OtekUYxBsxVc7U-z1TKAun1PAiiHuvXFXJlmw
https://private-user-images.githubusercontent.com/167278800/381332194-d99a8e36-f68b-4c22-807d-bc9327913c1d.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzQ3NjA1NTcsIm5iZiI6MTczNDc2MDI1NywicGF0aCI6Ii8xNjcyNzg4MDAvMzgxMzMyMTk0LWQ5OWE4ZTM2LWY2OGItNGMyMi04MDdkLWJjOTMyNzkxM2MxZC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMjIxJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTIyMVQwNTUwNTdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03Y2E0Nzk2OGI3OGI4ZDliZTk4NjgyNzE2YWUyMjA3ZWRhNWNlMWE3Y2QwODNhOTczZTIwMmRlOGM2MDM5NGJkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.-tRRT_J9ytSPE2tj0O0dFViEpsCTZ4WIpb21ukPjh8c