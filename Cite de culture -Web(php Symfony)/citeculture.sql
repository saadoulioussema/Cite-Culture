-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 05 déc. 2019 à 03:51
-- Version du serveur :  5.7.19
-- Version de PHP :  5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `citeculture`
--

-- --------------------------------------------------------

--
-- Structure de la table `actualites`
--

DROP TABLE IF EXISTS `actualites`;
CREATE TABLE IF NOT EXISTS `actualites` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_Debut` date NOT NULL,
  `date_Fin` date NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `titre` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `img` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `etat` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `annonce_prod`
--

DROP TABLE IF EXISTS `annonce_prod`;
CREATE TABLE IF NOT EXISTS `annonce_prod` (
  `id_prod` int(10) NOT NULL AUTO_INCREMENT,
  `nom_prod` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `stock` int(10) NOT NULL,
  `prix` int(10) NOT NULL,
  `image` varchar(255) NOT NULL,
  PRIMARY KEY (`id_prod`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `annonce_prod`
--

INSERT INTO `annonce_prod` (`id_prod`, `nom_prod`, `description`, `stock`, `prix`, `image`) VALUES
(19, 'Stars', 'Basic level painting, covering the basic steps an...', 79, 75, 'aa1936d8c5b8f13bbdcdd4efb793958d.png'),
(20, 'THE MOMENT OF LOVE', 'PALETTE KNIFE Oil Painting On Canvas By Leonid Afr...', 49, 250, '3253da38a74db58c4be4dcb15f0ba5de.png'),
(21, 'decoration element', 'decoration element for hous', 5, 200, '614d61d989ebee41d250f45cbda79560.png'),
(22, 'Painting Moonlight Stars', 'Basic level painting, covering the basic steps an..', -1, 70, '3f9b24b95db75fdfc00ea79a32980e2b.png'),
(27, 'arrangement antiquaire', 'arrangement antiquaire', -1, 200, '29c06462c0a9656ef5d65053e80e077a.jpeg'),
(28, 'Joli antiquaire', 'Joli antiquaire', 62, 100, '0813ada7f0d11d81dbf6bb9b999d3f29.jpeg'),
(29, 'Tableau', 'Tableau magnifique', 30, 250, 'd18f8c70728e00e1e98d6f1c6c05c7e9.jpeg'),
(30, 'a', 'a', 40, 2, 'f7dfc41e501caad9ad6a4308b8bc2cf6.jpeg'),
(32, 'qsdqsd', 'sdqdqsd', 3, 4256, 'C:\\wamp64\\tmp\\phpC6A4.tmp');

-- --------------------------------------------------------

--
-- Structure de la table `asign`
--

DROP TABLE IF EXISTS `asign`;
CREATE TABLE IF NOT EXISTS `asign` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `actualite_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `IDX_DC4AE702A2843073` (`actualite_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `avis`
--

DROP TABLE IF EXISTS `avis`;
CREATE TABLE IF NOT EXISTS `avis` (
  `IdAvis` int(11) NOT NULL AUTO_INCREMENT,
  `DescriptionAvis` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `IdUser` int(11) DEFAULT NULL,
  `IdEvent` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdAvis`),
  KEY `fk1` (`IdEvent`),
  KEY `fk30` (`IdUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `bookTitle` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bookAuthor` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `bookType` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `bookAddDate` date NOT NULL,
  `bookImage` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `bookquantity` int(11) NOT NULL,
  `bookAvail` tinyint(1) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `book`
--

INSERT INTO `book` (`bookId`, `bookTitle`, `bookAuthor`, `bookType`, `bookAddDate`, `bookImage`, `bookquantity`, `bookAvail`) VALUES
(1, 'dr', 'dr', 'dr', '2018-01-01', 'd78fbef370d239a2dc0fae8d31423313.jpeg', 1, 1),
(2, 'fqsd', 'fds', 'sdfs', '2023-10-01', '07633c9078d7d41a056cf5bc3bffc7a7.jpeg', 8, 1),
(3, 'ngf', 'jfgj', 'fgjfg', '2020-01-01', 'dc5790ca8764bc15979852819bd1cc6c.png', 4, 1);

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

DROP TABLE IF EXISTS `commande`;
CREATE TABLE IF NOT EXISTS `commande` (
  `id_cmd` int(10) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL,
  `total` int(10) NOT NULL,
  `id_client` int(10) NOT NULL,
  PRIMARY KEY (`id_cmd`),
  KEY `fk10` (`id_client`)
) ENGINE=MyISAM AUTO_INCREMENT=66 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `commande`
--

INSERT INTO `commande` (`id_cmd`, `date`, `total`, `id_client`) VALUES
(1, '0000-00-00 00:00:00', 111, 1),
(2, '0000-00-00 00:00:00', 111, 1),
(3, '2019-12-01 21:34:31', 907, 3),
(4, '2019-12-01 22:38:08', 537, 2),
(5, '2019-12-01 22:39:07', 787, 2),
(6, '2019-12-01 22:45:23', 789, 2),
(7, '2019-12-01 23:07:17', 70, 3),
(8, '2019-12-01 23:08:48', 70, 3),
(9, '2019-12-01 23:13:16', 70, 3),
(10, '2019-12-01 23:20:30', 70, 3),
(11, '2019-12-01 23:22:43', 70, 3),
(12, '2019-12-01 23:24:16', 145, 3),
(13, '2019-12-01 23:26:13', 395, 3),
(14, '2019-12-01 23:27:07', 395, 3),
(15, '2019-12-01 23:27:58', 395, 3),
(16, '2019-12-01 23:28:15', 395, 3),
(17, '2019-12-02 00:23:33', 395, 3),
(18, '2019-12-02 00:25:34', 395, 3),
(19, '2019-12-02 05:53:45', 395, 3),
(20, '2019-12-02 05:56:14', 395, 3),
(21, '2019-12-02 06:50:40', 400, 3),
(22, '2019-12-02 18:28:49', 403, 3),
(23, '2019-12-02 18:52:02', 200, 3),
(24, '2019-12-02 18:53:42', 200, 3),
(25, '2019-12-02 18:54:13', 200, 3),
(26, '2019-12-02 18:55:28', 200, 3),
(27, '2019-12-02 19:00:38', 200, 3),
(28, '2019-12-02 19:08:23', 200, 3),
(29, '2019-12-02 19:10:46', 200, 3),
(30, '2019-12-02 19:15:02', 200, 3),
(31, '2019-12-02 19:15:28', 200, 3),
(32, '2019-12-02 19:21:18', 270, 3),
(33, '2019-12-02 19:25:40', 270, 3),
(34, '2019-12-02 19:28:45', 345, 3),
(35, '2019-12-02 19:33:49', 345, 3),
(36, '2019-12-02 19:36:23', 345, 3),
(37, '2019-12-02 19:38:17', 545, 3),
(38, '2019-12-02 19:39:52', 795, 3),
(39, '2019-12-03 18:00:29', 798, 3),
(40, '2019-12-03 18:16:22', 873, 3),
(41, '2019-12-03 18:28:25', 73, 3),
(42, '2019-12-03 21:47:25', 7, 3),
(43, '2019-12-03 21:48:27', 7, 3),
(44, '2019-12-03 21:49:07', 7, 3),
(45, '2019-12-03 21:50:13', 7, 3),
(46, '2019-12-03 21:51:57', 7, 3),
(47, '2019-12-03 21:52:47', 7, 3),
(48, '2019-12-03 21:54:45', 7, 3),
(49, '2019-12-03 21:55:23', 7, 3),
(50, '2019-12-03 21:56:53', 3, 3),
(51, '2019-12-03 21:57:42', 3, 3),
(52, '2019-12-03 22:01:22', 75, 3),
(53, '2019-12-03 22:47:25', 250, 3),
(54, '2019-12-04 00:07:34', 100, 3),
(55, '2019-12-04 00:13:29', 250, 3),
(56, '2019-12-04 00:14:00', 250, 3),
(57, '2019-12-04 01:02:03', 250, 3),
(58, '2019-12-04 01:32:36', 250, 3),
(59, '2019-12-04 12:50:04', 250, 3),
(60, '2019-12-04 13:26:14', 350, 3),
(61, '2019-12-04 14:36:58', 250, 3),
(62, '2019-12-04 16:19:51', 250, 3),
(63, '2019-12-04 17:54:09', 100, 3),
(64, '2019-12-04 18:06:39', 4, 3),
(65, '2019-12-05 00:12:13', 750, 3);

-- --------------------------------------------------------

--
-- Structure de la table `demandevisite`
--

DROP TABLE IF EXISTS `demandevisite`;
CREATE TABLE IF NOT EXISTS `demandevisite` (
  `idDV` int(11) NOT NULL AUTO_INCREMENT,
  `Source` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `nomOrganismeD` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `nomResponsableD` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `numTelD` int(11) NOT NULL,
  `mailD` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `addPostaleD` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `dateVisiteD` date NOT NULL,
  `heureVisiteD` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `nbreVisiteursD` int(11) NOT NULL,
  `etatDV` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idDV`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `demandevisite`
--

INSERT INTO `demandevisite` (`idDV`, `Source`, `nomOrganismeD`, `nomResponsableD`, `numTelD`, `mailD`, `addPostaleD`, `dateVisiteD`, `heureVisiteD`, `nbreVisiteursD`, `etatDV`) VALUES
(1, 'aaa aaa', 'Association', 'aaa aaa', 28461120, 'fares.lakhal@esprit.tn', 'Monastir', '2020-01-01', '10:00', 15, 'Confirmed');

-- --------------------------------------------------------

--
-- Structure de la table `event`
--

DROP TABLE IF EXISTS `event`;
CREATE TABLE IF NOT EXISTS `event` (
  `IdEvent` int(11) NOT NULL AUTO_INCREMENT,
  `NomEvent` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `CategorieEvent` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NbrPlaceDispo` int(11) NOT NULL,
  `DateEvent` date NOT NULL,
  `HeureEvent` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Affiche` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`IdEvent`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `event`
--

INSERT INTO `event` (`IdEvent`, `NomEvent`, `CategorieEvent`, `NbrPlaceDispo`, `DateEvent`, `HeureEvent`, `Affiche`) VALUES
(2, 'fghjk', 'Theater', 500, '2019-12-23', '15:00', '22fc21de17776361da17ddb4eddbace0.jpeg'),
(3, 'mmmmm', 'Theater', 250, '2020-01-01', '16:00', '77cba9f8312599fe111048053036976b.jpeg');

-- --------------------------------------------------------

--
-- Structure de la table `favoirs`
--

DROP TABLE IF EXISTS `favoirs`;
CREATE TABLE IF NOT EXISTS `favoirs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `actualite_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `IDX_30764339A2843073` (`actualite_id`),
  KEY `IDX_30764339A76ED395` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `issue`
--

DROP TABLE IF EXISTS `issue`;
CREATE TABLE IF NOT EXISTS `issue` (
  `issueid` int(11) NOT NULL AUTO_INCREMENT,
  `bookid` int(11) DEFAULT NULL,
  `memberid` int(11) DEFAULT NULL,
  `booktitle` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `membername` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `memberlastname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `membermobile` int(11) NOT NULL,
  `issuetime` datetime NOT NULL,
  PRIMARY KEY (`issueid`),
  KEY `bookid` (`bookid`),
  KEY `memberid` (`memberid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `mail`
--

DROP TABLE IF EXISTS `mail`;
CREATE TABLE IF NOT EXISTS `mail` (
  `mailid` int(11) NOT NULL AUTO_INCREMENT,
  `toemail` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `subjet` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `message` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`mailid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `monument`
--

DROP TABLE IF EXISTS `monument`;
CREATE TABLE IF NOT EXISTS `monument` (
  `idM` int(11) NOT NULL AUTO_INCREMENT,
  `nomM` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `descriptionM` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `imageM` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idM`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `monument`
--

INSERT INTO `monument` (`idM`, `nomM`, `descriptionM`, `imageM`) VALUES
(1, 'Tableau', 'Fait par picasso.', 'a10d1b3df955e6af9317d1a339cd57d3.jpeg'),
(2, 'The Moneylender and his wife', 'Quentin Metsys, 1514. Flemish artist Quentin Metsys paints with exacting detail all the accoutrements of a greedy husband and wife team of money lenders.', 'ac24399b5e5e11f2eb20a6ee3c88cbbb.jpeg'),
(3, 'In Liberty Leading the People', 'A large-scale piece painted in 1830, Romantic artist Eugčne Delacroix explores all three of these motifs, culminating in a canvas that epitomizes the spirit of the Revolution.', 'b990b5ec7fdc11858635c195fa7ead35.jpeg'),
(4, 'The Bolt', 'Jean-Honoré Fragonard, c. 1777.  French painter Fragonard was the epitome of 18th century Rococo style with its focus on soft, pastel, fluffy interiors, and frivolous, hedonistic themes about lovers and romance.', '7b6a5a6592e22d85a3e6ba3e87988055.jpeg'),
(5, 'The nike of Samothrace', '(or Winged Victory) depicts the Greek goddess of Victory as if soaring to new heights.', '920c4acd6724dee923bf7db5db213efe.jpeg');

-- --------------------------------------------------------

--
-- Structure de la table `panier`
--

DROP TABLE IF EXISTS `panier`;
CREATE TABLE IF NOT EXISTS `panier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client` int(11) NOT NULL,
  `produit` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `client` (`client`),
  KEY `produit` (`produit`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `panier`
--

INSERT INTO `panier` (`id`, `client`, `produit`) VALUES
(1, 1, 19);

-- --------------------------------------------------------

--
-- Structure de la table `participation`
--

DROP TABLE IF EXISTS `participation`;
CREATE TABLE IF NOT EXISTS `participation` (
  `IdParticipation` int(11) NOT NULL AUTO_INCREMENT,
  `IdUser` int(11) DEFAULT NULL,
  `IdEvent` int(11) DEFAULT NULL,
  PRIMARY KEY (`IdParticipation`),
  KEY `fk3` (`IdEvent`),
  KEY `fk31` (`IdUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `prod_cmd`
--

DROP TABLE IF EXISTS `prod_cmd`;
CREATE TABLE IF NOT EXISTS `prod_cmd` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `id_prod` int(10) NOT NULL,
  `id_cmd` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk13` (`id_prod`),
  KEY `fk14` (`id_cmd`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `publicites`
--

DROP TABLE IF EXISTS `publicites`;
CREATE TABLE IF NOT EXISTS `publicites` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `titre` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `imag` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `publicites`
--

INSERT INTO `publicites` (`id`, `titre`, `description`, `imag`) VALUES
(1, 'ryjrrhtgef-uh-tygrfe', 'o_i-è_u-y(tlèku_-èj(h\'g(f', 'd49199d7c861e44b4bd6310a169ea876.jpeg'),
(2, 'oooooooooooooooooooo', 'oooooooooooooooooooooooo', '3cbbc5251d5acc314d31a173a7df40f7.jpeg');

-- --------------------------------------------------------

--
-- Structure de la table `reclamationm`
--

DROP TABLE IF EXISTS `reclamationm`;
CREATE TABLE IF NOT EXISTS `reclamationm` (
  `idRM` int(11) NOT NULL AUTO_INCREMENT,
  `Idsource` varchar(25) COLLATE utf8_unicode_ci NOT NULL,
  `roleSource` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `objetReclamation` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `descriptionReclamation` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `dateReclamation` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `statutsReclamation` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `reponseReclamation` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `destinationReclamation` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idRM`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `reclamationm`
--

INSERT INTO `reclamationm` (`idRM`, `Idsource`, `roleSource`, `objetReclamation`, `descriptionReclamation`, `dateReclamation`, `statutsReclamation`, `reponseReclamation`, `destinationReclamation`) VALUES
(1, 'aaa aaa', 'Client', 'Info', 'Quelle est l\'heure d\'ouverture ?', 'Wednesday 4 December 2019, 23:13:25', 'Seen', '8h du matin, Merci.', 'Admin');

-- --------------------------------------------------------

--
-- Structure de la table `reservevent`
--

DROP TABLE IF EXISTS `reservevent`;
CREATE TABLE IF NOT EXISTS `reservevent` (
  `IdReserv` int(11) NOT NULL AUTO_INCREMENT,
  `NomOrg` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PrenomOrg` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `TelOrg` int(11) NOT NULL,
  `MailOrg` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `CategorieReserv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NomReserv` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `NbrPlace` int(11) NOT NULL,
  `DateReserv` date NOT NULL,
  `Heure` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `Affiche` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `Etat` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`IdReserv`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `reservevent`
--

INSERT INTO `reservevent` (`IdReserv`, `NomOrg`, `PrenomOrg`, `TelOrg`, `MailOrg`, `CategorieReserv`, `NomReserv`, `NbrPlace`, `DateReserv`, `Heure`, `Affiche`, `Etat`) VALUES
(1, 'aaa', 'aaa', 52212427, 'a.a@a.tn', 'Theater', 'mmmmm', 250, '2020-01-01', '16:00', '77cba9f8312599fe111048053036976b.jpeg', 'Confirmed');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `IdSalle` int(11) NOT NULL AUTO_INCREMENT,
  `Libelle` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Capacite` int(11) NOT NULL,
  `CategorieSalle` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`IdSalle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `sponsoring`
--

DROP TABLE IF EXISTS `sponsoring`;
CREATE TABLE IF NOT EXISTS `sponsoring` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_contrat` date NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `username_canonical` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `email_canonical` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `salt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `last_login` datetime DEFAULT NULL,
  `confirmation_token` varchar(180) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_requested_at` datetime DEFAULT NULL,
  `roles` longtext COLLATE utf8_unicode_ci NOT NULL COMMENT '(DC2Type:array)',
  `nom` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `prenom` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `cin` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQ_8D93D64992FC23A8` (`username_canonical`),
  UNIQUE KEY `UNIQ_8D93D649A0D96FBF` (`email_canonical`),
  UNIQUE KEY `UNIQ_8D93D649C05FB297` (`confirmation_token`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `username`, `username_canonical`, `email`, `email_canonical`, `enabled`, `salt`, `password`, `last_login`, `confirmation_token`, `password_requested_at`, `roles`, `nom`, `prenom`, `cin`) VALUES
(1, 'aaa', 'aaa', 'a.a@a.tn', 'a.a@a.tn', 1, NULL, '$2y$13$4BaqWCVMt95bVVbN8oAsyugJ4NBiM/us5D3qHfWOAISTJ4fq7PKkS', '2019-12-05 03:43:33', NULL, NULL, 'a:1:{i:0;s:11:\"ROLE_CLIENT\";}', 'aaa', 'aaa', 123),
(2, 'admin', 'admin', 'admin.admin@gmail.com', 'admin.admin@gmail.com', 1, NULL, '$2y$13$FlATsub8XhwuZf3zkTNp2eISdYdPPAMHOmYUl4WYBtxX0hQJJylxK', '2019-12-05 02:34:54', NULL, NULL, 'a:1:{i:0;s:10:\"ROLE_AGENT\";}', 'admin', 'admin', 1234);

-- --------------------------------------------------------

--
-- Structure de la table `userrequest`
--

DROP TABLE IF EXISTS `userrequest`;
CREATE TABLE IF NOT EXISTS `userrequest` (
  `idrequest` int(11) NOT NULL AUTO_INCREMENT,
  `memberid` int(11) NOT NULL,
  `bookId` int(11) NOT NULL,
  `booktitle` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `membername` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `memberlastname` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `memberemail` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `membermobile` int(11) NOT NULL,
  `Issuedate` date NOT NULL,
  `issueperiod` int(11) NOT NULL,
  `requeststate` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idrequest`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `asign`
--
ALTER TABLE `asign`
  ADD CONSTRAINT `FK_DC4AE702A2843073` FOREIGN KEY (`actualite_id`) REFERENCES `actualites` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `avis`
--
ALTER TABLE `avis`
  ADD CONSTRAINT `FK_8F91ABF0E3D77026` FOREIGN KEY (`IdEvent`) REFERENCES `event` (`IdEvent`),
  ADD CONSTRAINT `FK_8F91ABF0F9C28DE1` FOREIGN KEY (`IdUser`) REFERENCES `user` (`id`);

--
-- Contraintes pour la table `favoirs`
--
ALTER TABLE `favoirs`
  ADD CONSTRAINT `FK_30764339A2843073` FOREIGN KEY (`actualite_id`) REFERENCES `actualites` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_30764339A76ED395` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `issue`
--
ALTER TABLE `issue`
  ADD CONSTRAINT `FK_12AD233E36BB5955` FOREIGN KEY (`bookid`) REFERENCES `book` (`bookId`),
  ADD CONSTRAINT `FK_12AD233E5B7FF48` FOREIGN KEY (`memberid`) REFERENCES `user` (`id`);

--
-- Contraintes pour la table `panier`
--
ALTER TABLE `panier`
  ADD CONSTRAINT `panier_ibfk_1` FOREIGN KEY (`client`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `panier_ibfk_2` FOREIGN KEY (`produit`) REFERENCES `annonce_prod` (`id_prod`);

--
-- Contraintes pour la table `participation`
--
ALTER TABLE `participation`
  ADD CONSTRAINT `FK_AB55E24FE3D77026` FOREIGN KEY (`IdEvent`) REFERENCES `event` (`IdEvent`) ON DELETE CASCADE,
  ADD CONSTRAINT `FK_AB55E24FF9C28DE1` FOREIGN KEY (`IdUser`) REFERENCES `user` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
