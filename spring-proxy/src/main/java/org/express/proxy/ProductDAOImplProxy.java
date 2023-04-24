package org.express.proxy;

public class ProductDAOImplProxy implements ProductDAO {

	ProductDAOImpl productDAOImpl;

	public ProductDAOImplProxy(ProductDAOImpl productDAOImpl) {
		this.productDAOImpl = productDAOImpl;
	}

	public Product getProductById(int id) {

		new DBConnectionUtil().connectToDb();

		Product product = productDAOImpl.getProductById(id);

		new DBConnectionUtil().close();

		return product;
	}

	public void saveProduct(Product product) {

	}

}
