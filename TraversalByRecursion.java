public void preOrderTrav (Node root)
{
	if(root != null)
		{
			sys(root.data);//A - B - C
			preOrderTrav(root.left);
                   preOrderTrav(root.right);
		}
}

public void inOrderTrav (Node root)
{
	if(root != null)
		{
			inOrderTrav(root.left);
			sys(root.data);//B-A-C
                        inOrderTrav(root.right);
		}
}


public void postOrderTrav (Node root)
{
	if(root != null)
		{				
						postOrderTrav(root.left);
						postOrderTrav(root.right);
						sys(root.data);//A - B - C

                   
		}
}


