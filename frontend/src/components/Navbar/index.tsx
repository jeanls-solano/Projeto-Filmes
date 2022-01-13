import './styles.css';
import { ReactComponent as GithubIcon } from 'assets/img/github.svg'
// "../" == esse comando faz voltar uma pasta
//"não é boa prática" obs : tem outro método 

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/jeanls-solano" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/jeanls-solano</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;