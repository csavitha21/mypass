**Problem Statement**
Objective: Design an API endpoint that retrieves the current qualifications and
completed training for workers assigned to a specific project.
Considerations:
1. The API should be accessible through a standard protocol like HTTP (GET
request).
2. The request should include the project identifier (e.g., project ID).
3. The response should be a structured format like JSON.
4. The response should include information for each worker assigned to the project:
   -  Worker ID
   -  Worker Name (optional)
   -  List of qualifications (e.g., qualification name, expiry date)
   -  List of completed training programs (e.g., program name, completion
       date)
6. Error handling should be implemented for invalid project IDs or other potential
issues.

**Solution**
![SequenceDiagram](https://github.com/user-attachments/assets/73366bb6-acaf-45df-98bc-8a5a79d25ec8)

**ER Diagram**
![Entity Relationship Diagram](https://github.com/user-attachments/assets/0526dfd5-a54a-4f01-95e7-85b083a1fa38)

**Swagger Doc**
http://localhost:8080/swagger-ui/index.html

**H2 DB**
http://localhost:8080/h2

**KeyCloak**
http://localhost:8180/realms/master/protocol/openid-connect/auth?client_id=security-admin-console
