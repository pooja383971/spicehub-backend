# SpiceHub Backend Deployment

## Build
Use Java 17 and run:

```bash
./mvnw clean package
```

On Windows PowerShell:

```powershell
.\mvnw.cmd clean package
```

## Runtime environment variables
Configure these in your hosting provider (for example, Render):

- `DB_URL`: JDBC URL for your hosted MySQL database, for example `jdbc:mysql://HOST:3306/foodapp`
- `DB_USERNAME`: hosted database username
- `DB_PASSWORD`: hosted database password
- `PORT`: optional; the platform usually supplies this automatically

Do not commit real database passwords to GitHub.

## Important
The project currently has MySQL as its runtime database. A hosted MySQL database must be provisioned and its connection details supplied through the environment variables above. The H2 database is used only for automated tests.
