package principal.mysql.hibernate.Models;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, String> surname;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Integer> id;
	public static volatile SingularAttribute<Person, Integer> age;

	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String AGE = "age";

}

