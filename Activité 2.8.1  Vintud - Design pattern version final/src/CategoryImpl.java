

public class CategoryImpl {
	
		private String nom,description;
		
		public CategoryImpl(String nom,String description) {
				this.nom=nom;
				this.description=description;
		}
		
			public CategoryImpl () {
				
			}

			public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}			
			
}
