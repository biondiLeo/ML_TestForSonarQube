import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.naive_bayes import MultinomialNB
from sklearn.metrics import accuracy_score

# Carica i dati dei log da un file CSV
data = pd.read_csv('log_data.csv')

# Dividi i dati in variabili di input (features) e variabile di output (target)
X = data['X']
y = data['Y']

# Codifica delle colonne di testo con Tf-idf
vectorizer = TfidfVectorizer()
X_encoded = vectorizer.fit_transform(X)

# Dividi i dati in set di addestramento e set di test
X_train, X_test, y_train, y_test = train_test_split(X_encoded, y, test_size=0.2, random_state=42)

# Converte l'array sparso in una rappresentazione densa
X_train = X_train.toarray()
X_test = X_test.toarray()

# Crea un modello Naive Bayes
nb_model = MultinomialNB()

# Addestra il modello sui dati di addestramento
nb_model.fit(X_train, y_train)

# Effettua predizioni sui dati di test
predictions = nb_model.predict(X_test)

# Valuta l'accuratezza del modello
accuracy = accuracy_score(y_test, predictions)
print("Accuracy:", accuracy)
print("Numero di esempi nel set di addestramento:", len(X_train))
print("Numero di esempi nel set di test:", len(X_test))

