class T{
	A a;	
	public static void main(String[] args){
		D d=new D();
		C c=new C();
		B b=new B();
		A a=new A();
		T t=new T();  //T�Ѿ�ʵ������
		
		c.d =d;
		b.c =c;
		a.b =b;
		t.a =a;
		
		//����t����i���������ڱ��࣬Ҳֻ��ͨ��ʵ������������
		System.out.println(t.a.b.c.d.i);
	}
}

class A{
	B b;
}

class B{
	C c;
}

class C{
	D d;
}

class D{
	int i;
}