import csv
from faker import Faker
import random
import time
import psutil

fake = Faker()


# La función para generar datos tiene un bucle que itera 500^2 veces.
# Cada iteración genera un conjunto de datos aleatorios, lo cual es una operación constante.
# En total, hay 500^2 iteraciones, por lo que la complejidad es O(n), donde n = 500^2.
def generate_data():
    data = []
    for _ in range(500 ** 2):
        # Generar datos (operaciones constantes)
        data.append([...])  # Operación constante

    return data


# La función para guardar en CSV involucra la escritura de 'n' filas en el archivo CSV.
# Escribir cada fila implica escribir 7 elementos en la fila, lo cual es una operación constante.
# En total, se escriben 500^2 filas, por lo que la complejidad es O(n), donde n = 500^2.
def save_to_csv(data, filename):
    with open(filename, mode='w', newline='') as file:
        writer = csv.writer(file)
        # Escribir la cabecera (operación constante)
        writer.writerow([...])  # Operación constante
        # Escribir datos (operaciones constantes)
        writer.writerows(data)  # Operación constante


if __name__ == "__main__":
    # La función principal genera datos y guarda en CSV, ambas operaciones con complejidad O(n),
    # donde n = 500^2, debido a las llamadas a generate_data y save_to_csv.

    # La llamada a generate_data tiene una complejidad de O(500^2), donde n = 500^2.
    # La llamada a save_to_csv tiene una complejidad de O(500^2), donde n = 500^2.
    start_time = time.time()  # Operación constante
    memoria_inicio = psutil.virtual_memory().used  # Operación constante
    generated_data = generate_data()  # Complejidad O(500^2)
    save_to_csv(generated_data, 'dummy_data.csv')  # Complejidad O(500^2)
    print("Data generation and CSV creation complete.")  # Operación constante
    end_time = time.time()  # Operación constante
    memoria_fin = psutil.virtual_memory().used  # Operación constante
    diferencia_memoria = abs(memoria_fin - memoria_inicio)  # Operación constante

    print(end_time - start_time)  # Operación constante
    print(f"la diferencia de memoria utilizada es: {diferencia_memoria} bytes")  # Operación constante
# la complejidad Big O de algoritmo es de O(n)



