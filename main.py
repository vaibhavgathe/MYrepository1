import pandas as pd
from pandas_profiling import ProfileReport
df = pd.read_csv('agri.csv')

print(df)
profile = ProfileReport(df)
profile.to_file(output_file="agri.html")