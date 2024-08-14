import pandas as pd
import matplotlib.pyplot as plt

titanic_df = pd.read_csv('/content/test.csv')
titanic_df.head(n=5)

rows,columns = titanic_df.shape
print(f'Rows: {rows}, Columns: {columns}')

titanic_df.isna()
titanic_df.isna().sum()

titanic_df.dropna(inplace=True)
titanic_df.to_csv('/content/test_clean.csv')

titanic_df['Age'].min()
print(titanic_df['Age'].min())
titanic_df['Age'].max()
print(titanic_df['Age'].max())
titanic_df['Age'].mean()
print(titanic_df['Age'].mean())
titanic_df['Age'].median()
print(titanic_df['Age'].median())

fare_titanic = titanic_df['Fare'].value_counts().reset_index()

fare_titanic.plot(x='Fare', y='Count', kind='bar', title='Fare Distribution', figsize=(10, 8), color='skyblue', edgecolor='palevioletred')
