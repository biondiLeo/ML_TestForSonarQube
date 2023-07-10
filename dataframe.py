import pandas as pd

# Dati di esempio
data = {
    'X': [
        'ERROR: Failed to connect to database',
        'WARNING: Disk space is running low',
        'ERROR: Invalid input received',
        'INFO: User logged in successfully',
        'ERROR: Application crashed'
    ],
    'Y': [
        'ACTION: Recheck database connection settings',
        'ACTION: Free up disk space immediately',
        'ACTION: Validate and sanitize user input',
        'ACTION: Log user login details',
        'ACTION: Investigate application crash'
    ]
}

# Creazione del DataFrame
df = pd.DataFrame(data)

# Salvataggio del DataFrame in un file CSV
df.to_csv('log_data.csv', index=False)
