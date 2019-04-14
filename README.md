Run tests in default profile

mvn '-Dtest=com.example.properties.*Tests' -Dspring.profiles.active=default test

or

mvn '-Dtest=com.example.properties.*Tests' test


Run tests in dev profile

mvn '-Dtest=com.example.properties.*Tests' -Dspring.profiles.active=dev test


