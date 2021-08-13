import os

dir = 'Easy'
for file in os.listdir(dir):
	if file.endswith('.java'):
		newName = file.replace('.java', '.md')
	elif file.endswith('.sh'):
		newName = file.replace('.sh', '.md')
	elif file.endswith('.sql'):
		newName = file.replace('.sql', '.md')
	print(file, newName)
	os.rename(os.path.join(dir, file), os.path.join(dir, newName))
	# break
	# content = ''
	# with open(os.path.join(dir, file), 'r') as f:
	# 	content = f.read()
	
	# content = content.split('\n')
	# content.insert(2, '')
	# content.append('```')
	# if file.endswith('.java'):
	# 	content.insert(4, '```java')
	# elif file.endswith('.sh'):
	# 	content.insert(4, '```shell')
	# elif file.endswith('.sql'):
	# 	content.insert(4, '```sql')

	# content[1] = '## ' + content[1].split(':', 1)[1][1:]
	# content[2] = 'Link:' + content[2].split(':', 1)[1]
	# content[3] = ''
	# content.remove('/*')
	# content = '\n'.join(content)
	# print(content)

	# with open(os.path.join(dir, file), 'w') as f:
	# 	f.write(content)

	# break